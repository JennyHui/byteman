package org.jboss.byteman.agent;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class TransformListenerTest {

    @Test
    public void initialize() throws InterruptedException {
        org.jboss.byteman.agent.TransformListener.initialize(mock(Retransformer.class));
        Thread.sleep(100000000l);
    }
}