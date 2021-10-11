package io.ticofab.androidgpxparser.parser.domain;

import java.util.List;

public class GpxHBExtensions {
    private final List<String> mImages;
    private final String mPostscript;
    private final Double mSpeed;
    private final Double mCourse;
    private final String mWeather;

    private GpxHBExtensions(Builder builder) {
        this.mImages = builder.mImages;
        this.mPostscript = builder.mPostscript;
        this.mSpeed = builder.mSpeed;
        this.mCourse = builder.mCourse;
        this.mWeather = builder.mWeather;
    }

    public List<String> getImages() {
        return mImages;
    }

    public String getPostscript() {
        return mPostscript;
    }

    public Double getSpeed() {
        return mSpeed;
    }

    public Double getCourse() {
        return mCourse;
    }

    public String getWeather() {
        return mWeather;
    }

    public static class Builder {
        private List<String> mImages;
        private String mPostscript;
        private Double mSpeed;
        private Double mCourse;
        private String mWeather;

        public Builder setImages(List<String> images) {
            mImages = images;
            return this;
        }

        public Builder setPostscript(String postscript) {
            mPostscript = postscript;
            return this;
        }

        public Builder setSpeed(Double speed) {
            mSpeed = speed;
            return this;
        }

        public Builder setCourse(Double course) {
            mCourse = course;
            return this;
        }

        public Builder setWeather(String weather) {
            mWeather = weather;
            return this;
        }

        public GpxHBExtensions build() {
            return new GpxHBExtensions(this);
        }
    }
}