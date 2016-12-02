package com.example.robotapp;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.support.annotation.RequiresPermission;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.*;
import java.lang.reflect.Array;
import java.net.Socket;
import java.net.ServerSocket;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @RequiresPermission(Manifest.permission.BLUETOOTH)
    private BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    private ServerSocket server;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            ServerSocket server = new ServerSocket(5678);
            PrintWriter out = new PrintWriter(client.getOutputStream(),true);
        }catch(Exception e) {

        }



    }


    Set<BluetoothDevice> pairedDevices = mBluetoothAdapter.getBondedDevices();
    Object[] myList = pairedDevices.toArray();
    BluetoothDevice device = (BluetoothDevice) myList[0];
    String deviceName = device.getName();
}
