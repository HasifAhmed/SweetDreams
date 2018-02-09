# SweetDreams
Ben Platt, Hasif Ahmed
But What Does the Data Say?

Hypothesis: Our methodology to find a value within a matrix runs in less than O(n^2) time.

Background: The method that we use to find the index of the value inside the matrices is the Finder() method. This method takes the
parameters of a matrix and a int (the number you're looking for). Our algorithm for this method, starts off at the top right of the matrix,
and works itself from there to the value put in the parameter. Because of how the matrices are sorted, if the value you are looking for, is
bigger than the top right, the method focuses on the value beneath it and keeps going until the parameter value is found. If the parameter
value is smaller than the top right, the method focuses on the value to the left of it and it keeps going until the parameter value is found. If the method cannot locate the parameter value within the matrix, it returns (-1,-1) as to signify that the parameter value does not exist
inside the parameter matrix.

Experiment Methodology:
We tackled our experiment by dividing it into multiple parts. The first part was to create varying test cases that differ by a 1000, going from 1,000 to 10,000. This gives us a fluid graph and allows us to see a linear change. Next, we used 3D arrays to hold all the test cases, so it would make it easier to iterate through them. Next, we used System.nanoTime() to attain time before and after we ran it, and found the difference to see how long it took our code to run once. We then decided to format our experiment so that it took the average of a 1000 runs of the test case.

Results:

![alt text](https://github.com/HasifAhmed/SweetDreams/blob/master/graph.png)
