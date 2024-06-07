package com.siepert.createlegacy.util;

import java.util.Random;

/**Some basic variables. */
public class Reference {
    public static final String MOD_ID = "create"; //Mod ID; will never change
    public static final String NAME = "Create Legacy"; //Mod name; will never change
    public static final String VERSION = "0.1.0"; //The version, changes each update in this fashion: rework.major.minor.patch
    public static final String CLIENT = "com.siepert.createlegacy.proxy.ClientProxy"; //Client proxy class
    public static final String COMMON = "com.siepert.createlegacy.proxy.CommonProxy"; //Common proxy class

    public static final boolean USE_OLD_KINETIC_SUSTEM = false;

    public static Random random = new Random(System.currentTimeMillis());
    public static TimedLucky timedLucky = new TimedLucky();
}
