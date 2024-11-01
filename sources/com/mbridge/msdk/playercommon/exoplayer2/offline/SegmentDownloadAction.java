package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import j$.util.DesugarCollections;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class SegmentDownloadAction<K extends Comparable<K>> extends DownloadAction {
    public final List<K> keys;

    /* loaded from: classes4.dex */
    protected static abstract class SegmentDownloadActionDeserializer<K> extends DownloadAction.Deserializer {
        public SegmentDownloadActionDeserializer(String str, int i8) {
            super(str, i8);
        }

        protected abstract DownloadAction createDownloadAction(Uri uri, boolean z8, byte[] bArr, List<K> list);

        @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction.Deserializer
        public final DownloadAction readFromStream(int i8, DataInputStream dataInputStream) throws IOException {
            Uri parse = Uri.parse(dataInputStream.readUTF());
            boolean readBoolean = dataInputStream.readBoolean();
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.readFully(bArr);
            int readInt = dataInputStream.readInt();
            List<K> arrayList = new ArrayList<>();
            for (int i9 = 0; i9 < readInt; i9++) {
                arrayList.add(readKey(dataInputStream));
            }
            return createDownloadAction(parse, readBoolean, bArr, arrayList);
        }

        protected abstract K readKey(DataInputStream dataInputStream) throws IOException;
    }

    protected SegmentDownloadAction(String str, int i8, Uri uri, boolean z8, byte[] bArr, List<K> list) {
        super(str, i8, uri, z8, bArr);
        if (z8) {
            Assertions.checkArgument(list.isEmpty());
            this.keys = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList);
            this.keys = DesugarCollections.unmodifiableList(arrayList);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        return this.keys.equals(((SegmentDownloadAction) obj).keys);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public int hashCode() {
        return (super.hashCode() * 31) + this.keys.hashCode();
    }

    protected abstract void writeKey(DataOutputStream dataOutputStream, K k8) throws IOException;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public final void writeToStream(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.uri.toString());
        dataOutputStream.writeBoolean(this.isRemoveAction);
        dataOutputStream.writeInt(this.data.length);
        dataOutputStream.write(this.data);
        dataOutputStream.writeInt(this.keys.size());
        for (int i8 = 0; i8 < this.keys.size(); i8++) {
            writeKey(dataOutputStream, this.keys.get(i8));
        }
    }
}
