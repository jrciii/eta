package ghcvm.runtime.exception;

import ghcvm.runtime.closure.StgClosure;
import ghcvm.runtime.closure.StgContext;
import ghcvm.runtime.stackframe.StackFrame;

public class StgCatchFame extends StackFrame {
    public final int exceptionsBlocked;
    public final StgClosure handler;

    public StgCatchFame(final StgClosure handler, final int exceptionsBlocked) {
        this.exceptionsBlocked = exceptionsBlocked;
        this.hanlder = handler;
    }

    @Override
    public void stackEnter(StgContext context) {
        /* This frame just sets context.R1 = context.R1,
           a trivial operation. Hence, the body is empty. */
    }

    @Override
    public RaiseAsyncResult doRaiseAsync() {

    }

}
