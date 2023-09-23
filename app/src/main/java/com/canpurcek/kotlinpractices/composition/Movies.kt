package com.canpurcek.kotlinpractices.composition

data class Movies(
    var movide_id  : Int,
    var movie_name : String,
    var movie_year: Int,
    var categorie : String,
    var director : Directors
){

}
