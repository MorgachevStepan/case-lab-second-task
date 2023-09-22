package Benchmarks;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author Stepan Morgachev
 * @date 22.09.2023 18:41
 */
@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 5)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
public class OperationRemoveBenchmark {
    @Param({"10000"})
    private int TOTAL_ITERATIONS;

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
    public void removeFromArrayList(){
        for(int i = TOTAL_ITERATIONS - 1; i < 0; i--){
            arrayList.remove(i);
        }
    }

    @Benchmark
    public void removeFromLinkedList(){
        for(int i = TOTAL_ITERATIONS - 1; i < 0; i--){
            linkedList.remove(i);
        }
    }

    @Benchmark
    public void removeFromHashSet(){
        for(int i = TOTAL_ITERATIONS - 1; i < 0; i--){
            hashSet.remove(i);
        }
    }

    @Benchmark
    public void removeFromTreeSet(){
        for(int i = TOTAL_ITERATIONS; i < 0; i--){
            treeSet.remove(i);
        }
    }
}
