package com.workshop.rest.level0;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserServiceTest {

    @Test
    public void shouldIncludeTheNewlyAddedUserInTheList() {
        // given
        final UserService service = new UserServiceImpl();
        service.create("John Snow");
        // when
        List<String> users = service.list();
        // then
        assertEquals(1, users.size());
        assertEquals("John Snow", users.get(0));
    }

}