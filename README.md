# Memory_Management_Group_Project

## Make sure you create a new Branch Before Commiting Any Work!
- If you have any Questions, ask

## All Code must be done by Wednesday December 13th
- We will Meet Friday the 15th to combine all code
- That weekend we will debug, work on report, and create powerpoint

## Things To Work On
1) PCB Class (Paulo)
    - Creates Processes by calling Process Generator
    - Starts our logic
      *  Calls LTS
      *  Calls Memory Manager
      *  Calls Calls STS
      *  Calls Memory Manager
      
3)  Process Generator (Paulo)
    - Creates a Process ** This should be a Java Class Object **
    - Gives Process an ID
    - Gives Process a size ** Number of Frames Needed **
    - Gives it a variable that is a Clock Object ** Austin Should have this code and knowledge ** 

5)  Long Term Scheduler (Teni)
    - FCFS Method
    - Takes Processes from New Queue and Adds them to Ready Queue
      * Pops process from New Queue
      * Push process to Ready Queue
      * Call GUI Refresh
7)  Short Term Scheduler (Alex)
    - Takes Processes from Ready Queue and does:
      * Starts timer
      * Finishes timer afer random period
      * Gets status result
    - Takes Result and does:
      * If status is Finsihed:
        - Reomve process from all queues
      * If status is notFinished:
        - Push Back to Ready queue
          * Pop from ready queue
          * Push to ready queue
9)  Memory Manager (Austin & Gerardo)
    - Fragmentation Function
      * Create an ArrayList to hold the sizes of empty Processes
      * Go through stack elements
        - If element is empty
          * Add to array
          * Pop Process
          * Add back size of empty to the end of the stack
11)  GUI (Gerardo)
