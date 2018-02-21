
This folder contains the necessary files to run **CapGen**.

``./CapGen.jar``: is the runnable CapGen. CapGen will be open sourced once the paper got accpeted.

``./config_local.txt``: is the config file for running CapGen (will be introduced later).

``./JDK_SOURCE``: contains the source code of JDK. Some of the bugs are related the classes in JDK, and thus the source codes are required for precise analysis. **Please set a absolute path**

``./lib``: contains the necessary libraries for running JUnit test cases

``./Lang``: contains the required libraries to run bugs for Lang project.


To run **CapGen**, you can run the following command:

**`` java -jar CapGen.jar [config_file]``**, it will reads the configurations in the config file automatically. ``config_file`` is optional.
It will reads from the file ``config_local.txt`` by default.

=====================

You need to set the following parameters in ``config_local.txt``:

``workLoc=.`` : The work directory, where to find the required libraries (``Lang/*``, and ``lib/*``). The default one is the current directory "."

``bugLoc = ../Defects4J``: The bug location, where stores the bug repository. If you cloned this project directly, the location is ``../Defects4J``.

``JDK7 = ../../software/jdk1.7.0_79/bin/``: Defects4J requires Java 1.7 to run all the bugs

``task = RepairABug`` : The task you want to run [RQ1/RQ3/RepairABug]

You can reproduce the results for RQ1 and RQ3 by setting the task to ``RQ1`` or ``RQ3`` respectively after downlonding this project directly.

Running ``RQ1`` or ``RQ3``, the number of ``P-A`` might be different since the number of the incorrect plausible patches displayed in the paper were counted only if they have been validated within 90 minutes. 

=====================

If the task is **RepairABug**, you need further specify the following parameters
 
``project = Chart``: the project

``bid = 1``: The bug ID

And the specific task you want to run {faultLocation, ingredientsExtraction, patchPrioritization, patchValidation, resultsAnalysis}

``faultLocation = true``: run GZoltar to produce the fault space [true/false]

``ingredientsExtraction = true``: to extract the fixing ingredients together with their contexts [true/false]

``patchPrioritization = true``: to generate candidate patches and rank them [true/false]

``patchValidation = true``: validate the patches generated [true/false]

``resultsAnalysis = true``: analyze the results [true/false]

By doing so, you can re-generate the intermedia files for the specific bug.
