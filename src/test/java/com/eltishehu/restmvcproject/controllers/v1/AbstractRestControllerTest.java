package com.eltishehu.restmvcproject.controllers.v1;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by e.sh. on 18-Oct-18
 */
public abstract class AbstractRestControllerTest {

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
