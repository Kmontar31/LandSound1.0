/*
 * Copyright (C) 2015 Naman Dwivedi
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */

package com.Kmontar31.LandSound.lastfmapi;

import com.Kmontar31.LandSound.lastfmapi.models.AlbumInfo;
import com.Kmontar31.LandSound.lastfmapi.models.AlbumTracks;
import com.Kmontar31.LandSound.lastfmapi.models.ArtistInfo;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Query;

public interface LastFmRestService {

    String BASE_PARAMETERS_ALBUM = "/?method=album.getinfo&api_key=59436cf5032dd42bfc94dce469aa89f6&format=json";
    String BASE_PARAMETERS_ARTIST = "/?method=artist.getinfo&api_key=59436cf5032dd42bfc94dce469aa89f6&format=json";
    String BASE_PARAMETER_TRACKS = "/?method=geo.gettoptracks&country=colombia&api_key=59436cf5032dd42bfc94dce469aa89f6";

    @Headers("Cache-Control: public")
    @GET(BASE_PARAMETERS_ALBUM)
    void getAlbumInfo(@Query("artist") String artist, @Query("album") String album, Callback<AlbumInfo> callback);

    @Headers("Cache-Control: public")
    @GET(BASE_PARAMETERS_ARTIST)
    void getArtistInfo(@Query("artist") String artist, Callback<ArtistInfo> callback);

    @Headers("Cache-Control: public")
    @GET(BASE_PARAMETER_TRACKS)
    void getTracks(@Query("tracks") String artist, Callback<AlbumTracks> callback);

}
