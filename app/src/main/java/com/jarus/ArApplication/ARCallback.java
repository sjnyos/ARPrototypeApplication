package com.jarus.ArApplication;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.media.ImageReader;
import android.os.Bundle;
import android.view.Surface;

import com.google.ar.core.Session;
import com.google.ar.core.SharedCamera;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;

import java.util.ArrayList;
import java.util.EnumSet;

public class ARCallback {
    private Context context;
    private int cameraID;
    Session sharedSession;
    SharedCamera sharedCamera;
    void onCreate(Bundle savedInstanceState) throws UnavailableSdkTooOldException, UnavailableDeviceNotCompatibleException, UnavailableArcoreNotInstalledException, UnavailableApkTooOldException {
        sharedSession = new Session(context, EnumSet.of(Session.Feature.SHARED_CAMERA));
      //  openCameraForSharing();
        //createCameraCaptureSession();
        // ...
    }
//    private void openCameraForSharing() {
//        sharedCamera = sharedSession.getSharedCamera();
//        // Use callback wrapper.
//        CameraManager.openCamera(
//                cameraID,
//                sharedCamera.createARDeviceStateCallback(
//                        appDeviceStateCallback, appHandler),
//                appHandler);
//    }
//    private void createCameraCaptureSession() {
//        // Get list of ARCore created surfaces. Required for ARCore tracking.
//        ArrayList<Surface> surfaceList = sharedCamera.getSurfaces();
//        // (Optional) Add a custom CPU image reader surface on devices that support CPU image access.
//        ImageReader cpuImageReader = ImageReader.newInstance(…);
//        surfaceList.add(cpuImageReader.getSurface());
//        // Use callback wrapper.
//        cameraDevice.createCaptureSession(
//                surfaceList,
//                sharedCamera.createARSessionStateCallback(
//                        appSessionStateCallback, appHandler),
//                appHandler);
//    }
}
