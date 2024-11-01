package androidx.datastore.preferences.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFormatEscaper {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface ByteSequence {
        byte byteAt(int i8);

        int size();
    }

    private TextFormatEscaper() {
    }

    static String escapeBytes(ByteSequence byteSequence) {
        StringBuilder sb = new StringBuilder(byteSequence.size());
        for (int i8 = 0; i8 < byteSequence.size(); i8++) {
            byte byteAt = byteSequence.byteAt(i8);
            if (byteAt == 34) {
                sb.append("\\\"");
            } else if (byteAt == 39) {
                sb.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (byteAt >= 32 && byteAt <= 126) {
                            sb.append((char) byteAt);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb.append((char) ((byteAt & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String escapeBytes(final ByteString byteString) {
        return escapeBytes(new ByteSequence() { // from class: androidx.datastore.preferences.protobuf.TextFormatEscaper.1
            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int i8) {
                return ByteString.this.byteAt(i8);
            }

            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return ByteString.this.size();
            }
        });
    }

    static String escapeBytes(final byte[] bArr) {
        return escapeBytes(new ByteSequence() { // from class: androidx.datastore.preferences.protobuf.TextFormatEscaper.2
            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int i8) {
                return bArr[i8];
            }

            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return bArr.length;
            }
        });
    }
}
