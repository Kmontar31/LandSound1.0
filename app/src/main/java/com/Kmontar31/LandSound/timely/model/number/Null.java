package com.Kmontar31.LandSound.timely.model.number;


import com.Kmontar31.LandSound.timely.model.core.Figure;

public class Null extends Figure {
    private static final float[][] POINTS = {
            {0.5f, 0.5f}, {0.5f, 0.5f}, {0.5f, 0.5f},
            {0.5f, 0.5f}, {0.5f, 0.5f}, {0.5f, 0.5f},
            {0.5f, 0.5f}, {0.5f, 0.5f}, {0.5f, 0.5f},
            {0.5f, 0.5f}, {0.5f, 0.5f}, {0.5f, 0.5f},
            {0.5f, 0.5f}
    };

    private static final Null INSTANCE = new Null();

    protected Null() {
        super(POINTS);
    }

    public static Null getInstance() {
        return INSTANCE;
    }
}