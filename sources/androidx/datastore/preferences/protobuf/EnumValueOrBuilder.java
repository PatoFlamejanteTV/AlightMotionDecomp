package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public interface EnumValueOrBuilder extends MessageLiteOrBuilder {
    String getName();

    ByteString getNameBytes();

    int getNumber();

    Option getOptions(int i8);

    int getOptionsCount();

    List<Option> getOptionsList();
}
