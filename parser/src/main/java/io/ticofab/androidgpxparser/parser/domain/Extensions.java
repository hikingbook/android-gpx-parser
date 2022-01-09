package io.ticofab.androidgpxparser.parser.domain;

import java.util.List;

/**
 *
 * NOTE:
 *
 *   Extensions to the GPX 1.1 format are completely arbitrary. The "speed" extension is
 *   added as it seems to be quite common, but anything else is by default not supported. If an
 *   extension is supported, it must be considered best-effort and it might fail in some cases.
 *
 *   For instance, someone might have a track where speed is reported as
 *
 *     <speed>15 km/h</speed>
 *
 *   The current Speed implementation uses Double numbers. The example above would fail.
 *
 */
public class Extensions {

    private final Double mSpeed;

    // GPXHB
    private final List<String> mImages;
    private final String mPostscript;
    private final Integer mFitnessLevel;
    private final List<Float> mLoadWeights;
    private final Double mCourse;
    private final String mWeather;

    private Extensions(Extensions.Builder builder) {
        mSpeed = builder.mSpeed;
        mImages = builder.mImages;
        mPostscript = builder.mPostscript;
        mFitnessLevel = builder.mFitnessLevel;
        mLoadWeights = builder.mLoadWeights;
        mCourse = builder.mCourse;
        mWeather = builder.mWeather;
    }

    public Double getSpeed() {
        return mSpeed;
    }

    public List<String> getImages() {
        return mImages;
    }

    public String getPostscript() {
        return mPostscript;
    }

    public Integer getFitnessLevel() {
        return mFitnessLevel;
    }

    public List<Float> getLoadWeights() {
        return mLoadWeights;
    }

    public Double getCourse() {
        return mCourse;
    }

    public String getWeather() {
        return mWeather;
    }

    public static class Builder {
        private Double mSpeed;

        // GPXHB
        private List<String> mImages;
        private String mPostscript;
        private Integer mFitnessLevel;
        private List<Float> mLoadWeights;
        private Double mCourse;
        private String mWeather;

        public Builder setSpeed(Double speed) {
            mSpeed = speed;
            return this;
        }

        public Builder setImages(List<String> images) {
            mImages = images;
            return this;
        }

        public Builder setPostscript(String postscript) {
            mPostscript = postscript;
            return this;
        }

        public Builder setFitnessLevel(Integer fitnessLevel) {
            mFitnessLevel = fitnessLevel;
            return this;
        }

        public Builder setLoadWeights(List<Float> loadWeights) {
            mLoadWeights = loadWeights;
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

        public Extensions build() {
            return new Extensions(this);
        }
    }
}
