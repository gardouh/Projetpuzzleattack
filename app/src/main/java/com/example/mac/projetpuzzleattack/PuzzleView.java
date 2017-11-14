package com.example.mac.projetpuzzleattack;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by mac on 11/13/17.
 */

class PuzzleView extends SurfaceView implements SurfaceHolder.Callback, Runnable{

    // Declaration des images

        private Bitmap block;
        private Bitmap 		diamant;
        private Bitmap 		perso;
        private Bitmap 		vide;
        private Bitmap[] 	zone = new Bitmap[4];
        private Bitmap 		up;
        private Bitmap 		down;
        private Bitmap 		left;
        private Bitmap 		right;
        private Bitmap 		win;


    public PuzzleView(Context context) {
        super(context);
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }

    @Override
    public void run() {

    }
}
