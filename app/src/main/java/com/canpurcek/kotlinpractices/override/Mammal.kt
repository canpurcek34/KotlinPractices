package com.canpurcek.kotlinpractices.override

open class Mammal: Animals() {
    override fun makeNoise() {

        //runs animal superclass method with the super keyword
        super.makeNoise()

        /**
        NOTE:
         **super** keyword represents the upper class(in this case: Animal class)

         **this** keyword represents the class it is in(in this case: Mammal class)
        **/
    }
}