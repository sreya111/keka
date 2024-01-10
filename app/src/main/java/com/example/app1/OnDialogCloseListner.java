package com.example.app1;

import android.content.DialogInterface;

public interface OnDialogCloseListner {

    default void onDialogClose(DialogInterface dialogInterface) {
    }
}

