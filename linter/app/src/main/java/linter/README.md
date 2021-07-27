Overview
In this lab I worked in two directory. The first one is the basiclibrary that still practice on the arrays. The second directory is linter directory that dedicated to how to deal and read a JavaScript file.

Methods
Basically directory:
weatherData(int[][] weeklyMonthTemperatures): This method accepts an int array of arrays and iterate through all of the data to find the min and max values. And Use a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterate from the min temp to the max temp and create a String containing any temperature not seen during the month and return that String.

tally(List<String> votes): This method accepts a List of Strings representing votes and returns one string to show what got the most votes.

Linter directory:
linterMessage (String path): This method accepts a String path. the path is the path of the javaScript file. The parpouse of this method is generates an error message whenever it finds a line that doesn’t end in a semi-colon