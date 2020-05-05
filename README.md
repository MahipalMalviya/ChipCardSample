# ChipCardSample

An easy to use CustomChipCard for Multi selection values. It is only for below androidx. Hope you like it.

Step 1. Add it in your root level build.gradle at the end of repositories:

      allprojects {
          repositories {
            ...
            maven { url 'https://jitpack.io' }
          }
      }
      
Step 2. Add the dependency in your app level build.gradle file:

        dependencies {
	        implementation 'com.github.MahipalMalviya:ChipCardSample:667d14996f'
	      }
        

Usage
_____________________________________________________________________________________________________________________________
Add this to your layout file:

<com.mahipal.customchipcard.ChipCard
   id="@+id/chip_card"
   android:layout_width="wrap_content"
   android:layout_height="wrap_content"
   app:chipText="Mahipal" />
	 
Click listener of ChipCard :

chip_card.setOnChipSelectedListener { view, isChecked ->
     if(isChecked) {
        Toast.makeText(this@MainActivity,"Chip card selected",Toast.LENGTH_SHORT).show()
     }
}
	 
