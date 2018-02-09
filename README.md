# SweetDreams
Ben Platt, Hasif Ahmed
But What Does the Data Say?

Hypothesis: Our methodology to find a value within a matrix runs in less than O(n^2) time.

Background:

Experiment Methodology:
We tackled our experiment by dividing it into multiple parts. The first part was to create varying test cases that differ by a 1000, going from 1,000 to 10,000. This gives us a fluid graph and allows us to see a linear change. Next, we used 3D arrays to hold all the test cases, so it would make it easier to iterate through them. Next, we used System.nanoTime() to attain time before and after we ran it, and found the difference to see how long it took our code to run once. We then decided to format our experiment so that it took the average of a 1000 runs of the test case.

Results:
<iframe src="https://docs.google.com/spreadsheets/d/e/2PACX-1vQiA2aom5IzCkEUKVt0SIbgfMiaRA3T--zQwyyupWBFhMG3yMdcsN_0Ev3qQYTWixyw10XEiCso-r93/pubchart?oid=193068704&amp;format=image"></iframe>
