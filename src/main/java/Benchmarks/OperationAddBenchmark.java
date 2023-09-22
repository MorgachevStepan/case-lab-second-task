package Benchmarks;

import org.openjdk.jmh.annotations.*;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author Stepan Morgachev
 * @date 19.09.2023 21:27
 */

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 5)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
public class OperationAddBenchmark {

    @Param({"100000"})
    private int TOTAL_ITERATIONS;

    @Benchmark
    public void addToArrayList(){
        List<Integer> data = new ArrayList<>();
        for(int i = 0; i < TOTAL_ITERATIONS; i++){
            data.add(i);
        }
    }

    @Benchmark
    public void addToLinkedList(){
        List<Integer> data = new LinkedList<>();
        for(int i = 0; i < TOTAL_ITERATIONS; i++)
            data.add(i);
    }

    @Benchmark
    public void addToTreeSet(){
        Set<Integer> data = new TreeSet<>();
        for(int i = 0; i < TOTAL_ITERATIONS; i++)
            data.add(i);
    }

    @Benchmark
    public void addToHashSet(){
        Set<Integer> data = new HashSet<>();
        for(int i = 0; i < TOTAL_ITERATIONS; i++)
            data.add(i);
    }

/*    private List<Integer> createData() {
        List<Integer> data = new ArrayList<>();
        return data;
    }*/
}
