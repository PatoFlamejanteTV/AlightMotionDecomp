package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: classes3.dex */
public abstract class BufferAllocator {
    private static final BufferAllocator UNPOOLED = new BufferAllocator() { // from class: androidx.datastore.preferences.protobuf.BufferAllocator.1
        @Override // androidx.datastore.preferences.protobuf.BufferAllocator
        public AllocatedBuffer allocateDirectBuffer(int i8) {
            return AllocatedBuffer.wrap(ByteBuffer.allocateDirect(i8));
        }

        @Override // androidx.datastore.preferences.protobuf.BufferAllocator
        public AllocatedBuffer allocateHeapBuffer(int i8) {
            return AllocatedBuffer.wrap(new byte[i8]);
        }
    };

    BufferAllocator() {
    }

    public static BufferAllocator unpooled() {
        return UNPOOLED;
    }

    public abstract AllocatedBuffer allocateDirectBuffer(int i8);

    public abstract AllocatedBuffer allocateHeapBuffer(int i8);
}
