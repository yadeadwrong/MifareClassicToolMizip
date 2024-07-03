package de.syss.MifareClassicTool.Activities;

import android.content.Intent;
import android.os.Bundle;
import de.syss.MifareClassicTool.R;

public class CreditModifier extends BasicActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_modifier);
    }

    @Override
    public void onStart() {
        super.onStart();
        Intent intent = getIntent();
        // Additional initialization can go here
    }
}

