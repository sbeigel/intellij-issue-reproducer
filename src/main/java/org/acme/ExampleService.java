package org.acme;

import java.util.List;

import org.jboss.logging.Logger;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExampleService {
    private static final Logger LOG = Logger.getLogger(ExampleService.class.getName());

    public void test1() {
        MyEntity e = MyEntity.findById(1L);
        LOG.info("This code is shown as unreachable");
    }

    public void test2() {
        List<MyEntity> l = MyEntity.find("foo = '123'").list();
        LOG.info("This code is shown as unreachable");
    }

    public void test3() {
        MyEntity.delete("foo = '123'");
        LOG.info("This code is shown as unreachable");
    }
}
