package androidx.browser.trusted;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
final class TokenContents {

    @NonNull
    private final byte[] mContents;

    @Nullable
    private List<byte[]> mFingerprints;

    @Nullable
    private String mPackageName;

    private TokenContents(@NonNull byte[] bArr) {
        this.mContents = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareByteArrays(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i8 = 0; i8 < Math.min(bArr.length, bArr2.length); i8++) {
            byte b9 = bArr[i8];
            byte b10 = bArr2[i8];
            if (b9 != b10) {
                return b9 - b10;
            }
        }
        if (bArr.length == bArr2.length) {
            return 0;
        }
        return bArr.length - bArr2.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static TokenContents create(String str, List<byte[]> list) throws IOException {
        return new TokenContents(createToken(str, list), str, list);
    }

    @NonNull
    private static byte[] createToken(@NonNull String str, @NonNull List<byte[]> list) throws IOException {
        Collections.sort(list, new Comparator() { // from class: androidx.browser.trusted.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compareByteArrays;
                compareByteArrays = TokenContents.compareByteArrays((byte[]) obj, (byte[]) obj2);
                return compareByteArrays;
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        for (byte[] bArr : list) {
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static TokenContents deserialize(@NonNull byte[] bArr) {
        return new TokenContents(bArr);
    }

    private void parseIfNeeded() throws IOException {
        if (this.mPackageName != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.mContents));
        this.mPackageName = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        this.mFingerprints = new ArrayList(readInt);
        for (int i8 = 0; i8 < readInt; i8++) {
            int readInt2 = dataInputStream.readInt();
            byte[] bArr = new byte[readInt2];
            if (dataInputStream.read(bArr) == readInt2) {
                this.mFingerprints.add(bArr);
            } else {
                throw new IllegalStateException("Could not read fingerprint");
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TokenContents.class == obj.getClass()) {
            return Arrays.equals(this.mContents, ((TokenContents) obj).mContents);
        }
        return false;
    }

    @NonNull
    public byte[] getFingerprint(int i8) throws IOException {
        parseIfNeeded();
        List<byte[]> list = this.mFingerprints;
        if (list != null) {
            return Arrays.copyOf(list.get(i8), this.mFingerprints.get(i8).length);
        }
        throw new IllegalStateException();
    }

    public int getFingerprintCount() throws IOException {
        parseIfNeeded();
        List<byte[]> list = this.mFingerprints;
        if (list != null) {
            return list.size();
        }
        throw new IllegalStateException();
    }

    @NonNull
    public String getPackageName() throws IOException {
        parseIfNeeded();
        String str = this.mPackageName;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return Arrays.hashCode(this.mContents);
    }

    @NonNull
    public byte[] serialize() {
        byte[] bArr = this.mContents;
        return Arrays.copyOf(bArr, bArr.length);
    }

    private TokenContents(@NonNull byte[] bArr, @NonNull String str, @NonNull List<byte[]> list) {
        this.mContents = bArr;
        this.mPackageName = str;
        this.mFingerprints = new ArrayList(list.size());
        for (byte[] bArr2 : list) {
            this.mFingerprints.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }
}
