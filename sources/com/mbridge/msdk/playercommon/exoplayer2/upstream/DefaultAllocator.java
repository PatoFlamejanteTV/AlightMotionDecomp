package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class DefaultAllocator implements Allocator {
    private static final int AVAILABLE_EXTRA_CAPACITY = 100;
    private int allocatedCount;
    private Allocation[] availableAllocations;
    private int availableCount;
    private final int individualAllocationSize;
    private final byte[] initialAllocationBlock;
    private final Allocation[] singleAllocationReleaseHolder;
    private int targetBufferSize;
    private final boolean trimOnReset;

    public DefaultAllocator(boolean z8, int i8) {
        this(z8, i8, 0);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final synchronized Allocation allocate() {
        Allocation allocation;
        try {
            this.allocatedCount++;
            int i8 = this.availableCount;
            if (i8 > 0) {
                Allocation[] allocationArr = this.availableAllocations;
                int i9 = i8 - 1;
                this.availableCount = i9;
                allocation = allocationArr[i9];
                allocationArr[i9] = null;
            } else {
                allocation = new Allocation(new byte[this.individualAllocationSize], 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return allocation;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final int getIndividualAllocationLength() {
        return this.individualAllocationSize;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final synchronized int getTotalBytesAllocated() {
        return this.allocatedCount * this.individualAllocationSize;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final synchronized void release(Allocation allocation) {
        Allocation[] allocationArr = this.singleAllocationReleaseHolder;
        allocationArr[0] = allocation;
        release(allocationArr);
    }

    public final synchronized void reset() {
        if (this.trimOnReset) {
            setTargetBufferSize(0);
        }
    }

    public final synchronized void setTargetBufferSize(int i8) {
        boolean z8;
        if (i8 < this.targetBufferSize) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.targetBufferSize = i8;
        if (z8) {
            trim();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final synchronized void trim() {
        try {
            int i8 = 0;
            int max = Math.max(0, Util.ceilDivide(this.targetBufferSize, this.individualAllocationSize) - this.allocatedCount);
            int i9 = this.availableCount;
            if (max >= i9) {
                return;
            }
            if (this.initialAllocationBlock != null) {
                int i10 = i9 - 1;
                while (i8 <= i10) {
                    Allocation[] allocationArr = this.availableAllocations;
                    Allocation allocation = allocationArr[i8];
                    byte[] bArr = allocation.data;
                    byte[] bArr2 = this.initialAllocationBlock;
                    if (bArr == bArr2) {
                        i8++;
                    } else {
                        Allocation allocation2 = allocationArr[i10];
                        if (allocation2.data != bArr2) {
                            i10--;
                        } else {
                            allocationArr[i8] = allocation2;
                            allocationArr[i10] = allocation;
                            i10--;
                            i8++;
                        }
                    }
                }
                max = Math.max(max, i8);
                if (max >= this.availableCount) {
                    return;
                }
            }
            Arrays.fill(this.availableAllocations, max, this.availableCount, (Object) null);
            this.availableCount = max;
        } catch (Throwable th) {
            throw th;
        }
    }

    public DefaultAllocator(boolean z8, int i8, int i9) {
        Assertions.checkArgument(i8 > 0);
        Assertions.checkArgument(i9 >= 0);
        this.trimOnReset = z8;
        this.individualAllocationSize = i8;
        this.availableCount = i9;
        this.availableAllocations = new Allocation[i9 + 100];
        if (i9 > 0) {
            this.initialAllocationBlock = new byte[i9 * i8];
            for (int i10 = 0; i10 < i9; i10++) {
                this.availableAllocations[i10] = new Allocation(this.initialAllocationBlock, i10 * i8);
            }
        } else {
            this.initialAllocationBlock = null;
        }
        this.singleAllocationReleaseHolder = new Allocation[1];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final synchronized void release(Allocation[] allocationArr) {
        try {
            int i8 = this.availableCount;
            int length = allocationArr.length + i8;
            Allocation[] allocationArr2 = this.availableAllocations;
            if (length >= allocationArr2.length) {
                this.availableAllocations = (Allocation[]) Arrays.copyOf(allocationArr2, Math.max(allocationArr2.length * 2, i8 + allocationArr.length));
            }
            for (Allocation allocation : allocationArr) {
                byte[] bArr = allocation.data;
                if (bArr != this.initialAllocationBlock && bArr.length != this.individualAllocationSize) {
                    throw new IllegalArgumentException("Unexpected allocation: " + System.identityHashCode(allocation.data) + ", " + System.identityHashCode(this.initialAllocationBlock) + ", " + allocation.data.length + ", " + this.individualAllocationSize);
                }
                Allocation[] allocationArr3 = this.availableAllocations;
                int i9 = this.availableCount;
                this.availableCount = i9 + 1;
                allocationArr3[i9] = allocation;
            }
            this.allocatedCount -= allocationArr.length;
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }
}
