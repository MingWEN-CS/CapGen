This folder contains all the validated patches, including the correct, plausible and invalid patches 
for all the repaired 22 bugs displayed in Table 3.

Each subfolder represents a subject, and each subsubfolder (e.g., ./Chart/Chart_1) represents a bug.

In the folder of each bug, each file (patch_1.txt) represents an validated cancidate patch. The number represents the patch ID.
The smaller the ID, the higher suspicious value for the corresponding patch.
For example, patch#1 possess the highest suspicous value and thus it is validated in the first place by CapGen.

Here, we specify the status (i.e., whether it is correct, plausible or invalid) of all the patches for each bug.

**Chart#1** (./Chart/Chart_1)
- correct: 99
- plausible: 99
- invalid: the others

**Chart#8** (./Chart/Chart_8)

- correct: 5
- plausible: 5,13,14,21,28,33,38,39,43,44,45,50,55,58,60,61,62,63,64,65,66,67,69,71,77,94,107,110,111,112,113,114,115,116,117,118,120,122,123,124,125,126,128,132,133,136,138,142,143,146,156,162,163,164,168,169,170,178,179,180,182,185
- invalid: the others

**Chart#11** (./Chart/Chart_11)

- correct: 27
- plausible: 27
- invalid: the others

**Chart#24** (./Chart/Chart_24)

- correct: 14
- plausible: 14
- invalid: the others

**Lang#6** (./Lang/Lang_6)

- correct: 216
- plausible: 216
- invalid: the others

**Lang#26** (./Lang/Lang_26)

- correct: 317
- plausible: 317
- invalid: the others

**Lang#43** (./Lang/Lang_43)

- correct: 9,10,51
- plausible: 9,10,51,69
- invalid: the others

**Lang#57** (./Lang/Lang_57)

- correct: 30,585,2074
- plausible: 30,585,2074
- invalid: the others

**Lang#59** (./Lang/Lang_59)

- correct: 59
- plausible: 59,94,95,120,129,130,148,149,161,182,191,194,195,203,204,276,277,320,345,543
- invalid: the others

**Math#5** (./Math/Math_5)

- correct: 150
- plausible: 150,407,413,414
- invalid: the others

**Math#30** (./Math/Math_30)

- correct: 172
- plausible: 172
- invalid: the others

**Math#33** (./Math/Math_33)

- correct: 43
- plausible: 43
- invalid: the others

**Math#53** (./Math/Math_53)

- correct: 129,136
- plausible: 129,136
- invalid: the others

**Math#57** (./Math/Math_57)

- correct: 78
- plausible: 78
- invalid: the others

**Math#58** (./Math/Math_58)

- correct: 456
- plausible: 456
- invalid: the others

**Math#59** (./Math/Math_59)

- correct: 9
- plausible: 9
- invalid: the others

**Math#63** (./Math/Math_63)

- correct: 4
- plausible: 4,8,33,82,118,147,148,149,156
- invalid: the others

**Math#65** (./Math/Math_65)

- correct: 3
- plausible: 3
- invalid: the others


**Math#70** (./Math/Math_70)

- correct: 23
- plausible: 23
- invalid: the others

**Math#75** (./Math/Math_75)

- correct: 7
- plausible: 7
- invalid: the others



**Math#80** (./Math/Math_80)

- correct: 217
- plausible: 149,162,217,293,435,436,437,484,728,930,1495,1607,3238,3981,4111,4360,4422,5983,6504,7138,10572,10625,10626,10628,11036,11038,11588,11979,12272,12604,12798,13585,16505,16513,17694,17790,18599,18869,19635,20012,20116,20477,20479,20588,20801,21368,23651,24509,26610,27805,28924,28929,30822,31573,32956,33647,34034,35335,35469,35506,37100,37102,37860,37942,38169,38428,38484,38548,38549,38836,39423,39879,40375,40946,41955,43823,44059,44694,47188,47348,47884,47890,48193,49352,49701,49702,50482,50483,51263,51264,51310,51369,51549,52060,52066,52106,52110,52135,52173,52178,52591,55226,55878,55968,56609,58377,58379,58525,59048,59099,61150,61253,61257,61576,62440,62671,62721,63333,65519,65643,66456,67136,68023,68672,68937
- invalid: the others

**Math#85** (./Math/Math_85)

- correct: 3
- plausible: 3,11,13,77
- invalid: the others


The total number of patches validated for each bug is different from the total number of patches displayed in Table 3.
The reason is that this repository only contains those "validated" patches while Table 3 denotes the total number of candidate patches in the search space.

We only validate those patches whose suspicious value is greater than 0.
If the suspicious value for a candidate patch is 0 (for example, the context similarity of the fixing ingredients is 0), CapGen will not
validate such patch.
