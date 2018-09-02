package com.jojoldu.book.travis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jojoldu@gmail.com on 01/09/2018
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(profiles = {"set1", "real-db", "real-cache"})
public class ApiControllerTest {

    @Autowired
    private ApiController apiController;

    @Test
    public void 여러profile이있어도_set1_set2를_조회한다() {
        //given
        String expectedProfile = "set1";

        //when
        String profile = apiController.profile();

        //then
        assertThat(expectedProfile, is(profile));

    }
}
