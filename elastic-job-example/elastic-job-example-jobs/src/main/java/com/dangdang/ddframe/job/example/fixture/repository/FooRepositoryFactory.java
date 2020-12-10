package com.dangdang.ddframe.job.example.fixture.repository;

public final class FooRepositoryFactory {

    private static FooRepository fooRepository = new FooRepository();

    public static FooRepository getFooRepository() {
        return fooRepository;
    }

}
