This folder contains all the validated patches, including the correct, plausible and invalid patches 
for all the repaired 22 bugs displayed in Table 3.

Each subfolder represents a subject, and each subsubfolder (e.g., ./Chart/Chart_1) represents a bug.

In the folder of each bug, each file (patch_1.txt) represents an validated cancidate patch. The number represents the patch ID.
The smaller the ID, the higher suspicious value for the corresponding patch.
For example, patch#1 possess the highest suspicous value and thus it is validated in the first place by CapGen.

Here, we specify the status (i.e., whether it is correct, plausible or invalid) of all the patches for each bug.

**Chart#1** (./Chart/Chart_1)

correct: 99

plausible: 99

invalid: the others

**Chart#8** (./Chart/Chart_8)

correct: 5

plausible:5,13,14,21,28,33,38,39,43,44,45,50,55,58,60,61,62,63,64,65,66,67,69,71,77,94,107,110,111,112,113,114,115,116,117,118,120,122,123,124,125,126,128,132,133,136,138,142,143,146,156,162,163,164,168,169,170,178,179,180,182,185

invalid: the others

**Chart#11** (./Chart/Chart_11)

correct: 27

plausible: 27

invalid: the others

**Chart#24** (./Chart/Chart_24)

correct: 14

plausible: 14

invalid: the others

**Lang#6** (./Lang/Lang_6)

correct: 216

plausible: 216

invalid: the others

**Lang#26** (./Lang/Lang_26)

correct: 317

plausible: 317

invalid: the others

**Lang#43** (./Lang/Lang_43)

correct: 9,10,51

plausible: 9,10,51,69

invalid: the others

**Lang#57** (./Lang/Lang_57)

correct: 30

plausible: 30

invalid: the others

**Lang#59** (./Lang/Lang_59)

correct: 59

plausible: 59,94,95,120,129,130,148,149,161,182,191,194,195,203,204,276,277,320,345,543

invalid: the others

**Math#5** (./Lang/Math_5)

correct: 150

plausible: 150,407,413,414

invalid: the others

The total number of patches validated for each bug is different from the total number of patches displayed in Table 3.
The reason is that this repository only contains those "validated" patches while Table 3 denotes the total number of candidate patches in the search space.

We only validate those patches whose suspicious value is greater than 0.
If the suspicious value for a candidate patch is 0 (for example, the context similarity of the fixing ingredients is 0), CapGen will not
validate such patch.
