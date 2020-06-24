package com.rogers.dogsapp.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceFragmentCompat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rogers.dogsapp.R;

public class SettingsFragment extends PreferenceFragmentCompat {


    public SettingsFragment() {
     }

     public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.settings, rootKey);
     }

  }