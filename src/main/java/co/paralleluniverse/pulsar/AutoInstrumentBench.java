package co.paralleluniverse.pulsar;

import cljbench.CljMain;
import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.strands.SuspendableCallable;
import nbody.NBodyMain;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.ExecutionException;

@State(Scope.Benchmark)
public class AutoInstrumentBench {
//    protected ThreadLocal<Object> tl;

    @Setup
    public void init() {
        NBodyMain.init();
//        this.tl = new ThreadLocal<>();
//        tl.set(new Object());
    }

/*
    @Benchmark
    public void benchFiberNBody(final Blackhole bh) throws ExecutionException, InterruptedException {
        bh.consume(new Fiber((SuspendableCallable) () -> NBodyMain.bench()).start().get());
    }
*/
    @Benchmark
    public void benchNBody(final Blackhole bh) {
        bh.consume(NBodyMain.bench());
    }

/*
    @Benchmark
    public void benchGetCurrentThread(final Blackhole bh) {
        bh.consume(Thread.currentThread());
    }

    @Benchmark
    public void benchGetThreadLocal(final Blackhole bh) {
        bh.consume(tl.get());
    }

    @Benchmark
    public void benchCljCall(final Blackhole bh) {
        bh.consume(CljMain.fncall(tl));
    }
*/
}
