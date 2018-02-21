This folder contains all the validated patches, including the correct, plausible and invalid patches 
for all the repaired 22 bugs displayed in Table 3.

Each subfolder represents a subject.

The total number of patches validated for each bug (e.g., ./Chart/Chart_1) is different from the total number of patches displayed in Table 3.
The reason is that this repository only contains those "validated" patches while Table 3 denotes the total number of candidate patches in the search space.

We only validate those patches whose suspicious value is greater than 0.
If the suspicious value for a candidate patch is 0 (for example, the context similarity of the fixing ingredients is 0), CapGen will not
validate such patch.
