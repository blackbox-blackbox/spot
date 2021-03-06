package io.github.kobakei.spotsample.entity;

import java.util.Date;
import java.util.Set;

import io.github.kobakei.spot.annotation.Pref;
import io.github.kobakei.spot.annotation.PrefBoolean;
import io.github.kobakei.spot.annotation.PrefFloat;
import io.github.kobakei.spot.annotation.PrefInt;
import io.github.kobakei.spot.annotation.PrefLong;
import io.github.kobakei.spot.annotation.PrefString;
import io.github.kobakei.spot.annotation.PrefStringSet;
import io.github.kobakei.spotsample.converter.DateTypeConverter;

/**
 * Sample entity class.
 * POJO with annotations.
 * Created by keisukekobayashi on 16/03/31.
 */
@Pref(name = "sample")
public class SampleModel {
    @PrefLong(name = "number_long", defaultValue = 10000L)
    public long numberLong;

    @PrefInt(name = "number_int", defaultValue = 100)
    public int numberInt;

    @PrefFloat(name = "number_float", defaultValue = 1.2f)
    public float numberFloat;

    @PrefBoolean(name = "is_enabled", defaultValue = true)
    public boolean isEnabled;

    @PrefString(name = "text", defaultValue = "init")
    public String text;

    @PrefStringSet(name = "text_set")
    public Set<String> textSet;

    @PrefLong(name = "date", converter = DateTypeConverter.class)
    public Date date;

    public SampleModel() {

    }
}
