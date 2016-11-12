package com.programbuddy.mapperformancetest;

import org.junit.Test;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PerformanceLongTest {

    @Test
    public void launchBenchmark() throws Exception {
        Options opt = new OptionsBuilder()
                .include(this.getClass().getName() + ".*")
                .mode(Mode.All)
                .timeUnit(TimeUnit.MICROSECONDS)
                .warmupTime(TimeValue.seconds(1))
                .warmupIterations(10)
                .measurementTime(TimeValue.seconds(1))
                .measurementIterations(100)
                .threads(1)
                .forks(1)
                .shouldFailOnError(true)
                .shouldDoGC(true)
                .build();

        new Runner(opt).run();
    }

    @Benchmark
    public void performanceMethodAccess(BenchmarkState state, Blackhole bh) throws Exception {
        bh.consume(state.foo.getList());
    }

    @Benchmark
    public void performanceMapAccess(BenchmarkState state, Blackhole bh) throws Exception {
        bh.consume(state.map.get(state.foo.getId()));
    }

    @Benchmark
    public void performanceMap1000000Access(BenchmarkState state, Blackhole bh) throws Exception {
        bh.consume(state.map1000000.get(state.foo.getId()));
    }

    @Benchmark
    public void performanceMap1000000Size1000Access(BenchmarkState state, Blackhole bh) throws Exception {
        bh.consume(state.map1000000size1000.get(state.foo.getId()));
    }

    @State(Scope.Thread)
    public static class BenchmarkState {
        Foo foo;
        HashMap<String, List> map;
        HashMap<String, List> map1000000;
        HashMap<String, List> map1000000size1000;

        @Setup(Level.Trial)
        public void initialize() {
            foo = new Foo("1a485268-2722-43d7-831b-fd5940cc42ff");
            map = new HashMap<>();
            map.put(foo.getId(), foo.getList());
            map1000000 = new HashMap<>();
            for (long i = 0; i < 1000000l; i++) {
                map1000000.put(foo.getId() + "i", foo.getList());
            }
            map1000000size1000 = new HashMap<>(1000);
            for (long i = 0; i < 1000000l; i++) {
                map1000000size1000.put(foo.getId() + "i", foo.getList());
            }
        }
    }

    private static class Foo {
        private String id;
        private List list;

        public Foo(String id) {
            this.id = id;
            this.list = new ArrayList();
        }

        public String getId() {
            return id;
        }

        public List getList() {
            return list;
        }
    }

}
