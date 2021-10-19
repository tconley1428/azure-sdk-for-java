// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a custom preset for encoding the input content using the encoder processor. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.EncoderCustomPreset")
@Fluent
public final class EncoderCustomPreset extends EncoderPresetBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncoderCustomPreset.class);

    /*
     * Describes a custom preset for encoding audio.
     */
    @JsonProperty(value = "audioEncoder")
    private AudioEncoderBase audioEncoder;

    /*
     * Describes a custom preset for encoding video.
     */
    @JsonProperty(value = "videoEncoder")
    private VideoEncoderBase videoEncoder;

    /**
     * Get the audioEncoder property: Describes a custom preset for encoding audio.
     *
     * @return the audioEncoder value.
     */
    public AudioEncoderBase audioEncoder() {
        return this.audioEncoder;
    }

    /**
     * Set the audioEncoder property: Describes a custom preset for encoding audio.
     *
     * @param audioEncoder the audioEncoder value to set.
     * @return the EncoderCustomPreset object itself.
     */
    public EncoderCustomPreset withAudioEncoder(AudioEncoderBase audioEncoder) {
        this.audioEncoder = audioEncoder;
        return this;
    }

    /**
     * Get the videoEncoder property: Describes a custom preset for encoding video.
     *
     * @return the videoEncoder value.
     */
    public VideoEncoderBase videoEncoder() {
        return this.videoEncoder;
    }

    /**
     * Set the videoEncoder property: Describes a custom preset for encoding video.
     *
     * @param videoEncoder the videoEncoder value to set.
     * @return the EncoderCustomPreset object itself.
     */
    public EncoderCustomPreset withVideoEncoder(VideoEncoderBase videoEncoder) {
        this.videoEncoder = videoEncoder;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (audioEncoder() != null) {
            audioEncoder().validate();
        }
        if (videoEncoder() != null) {
            videoEncoder().validate();
        }
    }
}