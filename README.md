# SpotifyPlaylist

GOAL OF THIS PROJECT: 
* Read from multiple files and store in array
* Build a playlist of song tracks
* Find the track that was most recently listened to

STEPS: 

**Reading from multiple files

* Use import java.io.* and java.util.*; so we can use BufferedReader and io for files
* Create files with the file path in a variable named file1, file2, and file3
* Create ArrayList named myFiles to store the 3 files that we're reading from

**Build playlist

* Use a for loop with the br (BufferedReader) to read each file.
* Create a queue with named playlist to print all the tracks. 
* Use a for loop to print the tracks including a counter to keep count of the tracks

**To find last played song:

*  Each time a song is played add it to the stack. To retrieve last played song use peek()
