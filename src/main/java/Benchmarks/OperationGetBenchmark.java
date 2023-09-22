package Benchmarks;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author Stepan Morgachev
 * @date 22.09.2023 16:12
 */
@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 5)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
public class OperationGetBenchmark {
    @Param({"10000"})
    private int TOTAL_ITERATIONS;
    @Param({"5000"})
    private int INDEX_OF_ELEMENT;

    private List<Integer> arrayList;
    private List<Integer> linkedList;
    private Set<Integer> hashSet;
    private Set<Integer> treeSet;

    @Setup
    public void setup(){
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        hashSet = new HashSet<>();
        treeSet = new TreeSet<>();

        for (int i = 0; i < TOTAL_ITERATIONS; i++){
            arrayList.add(i);
            linkedList.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }
    }

    @Benchmark
    public void getFromArrayList(Blackhole blackhole){
        for(int i = 0; i < TOTAL_ITERATIONS; i++){
            blackhole.consume(arrayList.contains(INDEX_OF_ELEMENT));
        }
    }

    @Benchmark
    public void getFromLinkedList(Blackhole blackhole){
        for(int i = 0; i < TOTAL_ITERATIONS; i++){
            blackhole.consume(linkedList.contains(INDEX_OF_ELEMENT));
        }
    }

    @Benchmark
    public void getFromHashSet(Blackhole blackhole){
        for(int i = 0; i < TOTAL_ITERATIONS; i++){
            blackhole.consume(hashSet.contains(INDEX_OF_ELEMENT));
        }
    }

    @Benchmark
    public void getFromTreeSet(Blackhole blackhole){
        for(int i = 0; i < TOTAL_ITERATIONS; i++){
            blackhole.consume(treeSet.contains(INDEX_OF_ELEMENT));
        }
    }
}
