# CSC/CPE 138 – Computer Networking Fundamentals

### CSUS, College of Engineering and Computer Science
### Department of Computer Science
### CSC/CPE 138 – Computer Networking Fundamentals

Instructor:     Jun Dai, Associate Professor in Department of Computer Science
Office:         RVR 5060
Phone:          (916)-278-5163
Email:          emails through Canvas (preferred) or jun.dai@csus.edu
                (Please include “CSC/CPE 138” at the beginning of the subject line)
Office Hours:   Tuesdays and Thursdays (1:30-3:30pm) (hybrid, i.e., both in person and online)
Homepage:       http://athena.ecs.csus.edu/~daij/
Textbook:       Kurose & Ross, Computer Networking A Top-Down Approach, Addison Wesley,
                6th/7th/8th Edition.
                As a plus to the textbooks, course slides, assignments and other artifacts will be
                available to you through Canvas.

### Catalog Description:
Overview, structure, models, concepts, principles and protocols of computer networking.
Network architecture, ISO/OSI reference model, TCP/IP protocol stack, layering. Protocol,
encapsulation, socket. HTTP, FTP, SMTP, DNS, P2P, TCP, UDP. Multiplexing and
demultiplexing, reliable data transfer, flow control, congestion control. Internet addressing,
routing, forwarding, IP, ICMP. Error detection and correction, multiple access problem, LAN vs
WAN, Ethernet, ARP, switching. Wireless standards. Network security, threats and attacks,
defense and countermeasures. Cross Listed: CPE 138; only one may be counted for credit.

### Prerequisite:
This course requires satisfactory completion of CSC 35, CSC 60 and CSC 130 or their
equivalents. It is assumed that each student is prepared for this course and meets the following
criteria. If not then it may require outside preparation.

### Student Learning Objectives:
1. Explain the basic principles, architecture, and implementations of computer networks and
the Internet.
2. Describe the differences between different types of networks.
3. Describe network architecture, layered model, and protocol stack.
4. Describe the details of the different types of network protocols.
5. Apply reliable communication including the various methods for handling error detection,
correction, flow control, and congestion control.
6. Distinguish among the different components of computer networks.
7. Demonstrate working knowledge of network management including monitoring,
measurement, analysis, change, employee devices and control.
8. Demonstrate ability to develop communication protocols and networking applications.
9. Apply the knowledge to properly analyze and describe network performance issues
especially delays.
10. Apply the knowledge to assess potential network threats and mitigate them via common
security defense mechanisms and countermeasures.
11. Identify professional, ethical, and security issues and responsibilities.
12. Demonstrate a thorough understanding of the Python scripting language.
13. Analyze network traffic using tools like Wireshark.

### Course Policies:
<pre>
Tentative Grading Policy:
    Middle-quiz/exam + Final-quiz/exam 25% + 30%
    Wireshark Labs 20%
    Programming Assignments/Projects 25%

Grading Breakdown (%):
    A = 93-100 C = 73-76
    A- = 90-92 C- = 70-72
    B+ = 87-89 D+ = 67-69
    B = 83-86 D = 63-66
    B- = 80-82 D- = 60-62
    C+ = 77-79 F = 59 or below
</pre>

Students are required to keep backup (machine-readable) copies of all submitted work, and
also to keep all returned (graded) work, until after final grades are posted.

All the assignments will be graded with 100 as highest. The final scores will then be the
weighted score, and rounded up to match the above scale. Please note that final score is not
negotiable. Also, the highest grade in the university system is A. You will need a passing
grade for all course exams to pass the whole class.

For labs and projects, as long as your answer involves certain commands or operations in
specific software, screenshots are also needed to demonstrate your result.

The lab report, project report and oral presentation are supposed to illustrate or explain what you
did (commands or configurations) and what you got (screenshots and analysis). They will all be
evaluated based on the following grading criteria.
    Correctness                 25%
    Completeness                25%
    Clearness                   25%
    Quality of English writing  25%
----------------------------------------------------
### Online Instruction/Remote Learning
This class is designed to support both synchronous and asynchronous learning. To achieve this,
the instructor will be in person in the classroom, and synchronous learners can attend the class for
study. Asynchronous learners can choose to access pre-recorded lectures for study. For both
synchronous and asynchronous learners, the course content and instruction pace will be the same.
Class attendance not mandatory.

All the course materials will be organized via Canvas. This course requires access to a computer
with internet connectivity. Software requirement: Wireshark, Python. Hardware requirement (for
asynchronous learners): audio capability, such as microphone and speaker.
----------------------------------------------------
### Individual Work
All the parts in this course should be accomplished independently!

Note: Specific instructions for labs and projects, including the deliverable requirements and
due dates, will be assigned in separate documents. So, please make sure you get this
important information in class or via Canvas/email. Programming exercises will be graded for
appearance, programming style and comments as well as for correctness. All output should be
identified and illustrated, and the input used for any program should be listed and explained. Your
programming assignments will be completed on a Linux system (or Windows if possible). When
applicable, input should be read from a file/console, and output redirected to a file/console, so
that the inputs, outputs and program listings can be easily printed/snapshoted. Unlike labs and
projects, homework assignments will not be graded, but it is a good idea to do them because it
they will help you in the quizzes/exam.

Submission Rules:
    Each submission needs to be in an electronic version (through Canvas). Any file needs
    be named according to one of the following formats (depending on the submission type).
    Please do NOT use txt format. PDF/Word format is preferable. Please also write your
    section number in document (otherwise, you will lose points).
    
    CSC138_sec#_project#_name,
    CSC138_sec#_lab#_name,

    For example, if James Green is submitting project 1, the file name of the submission
    should be CSC138_project1_James_Green. On the first page of each submitted
    document, please always list your name as the author. Please note: if the attachment is
    not according to proper format as stated above, it will not be accepted.


CSC/CPE 138 - TENTATIVE SCHEDULE SUBJECT TO CHANGE
<pre>
Week        Topics and Major Content                    Assignments
1           Syllabus                                        
            - Course Introduction
            Chapter 1: Introduction
            - Overview, Big picture
            - Network Edge, Network Core

2           Chapter 1: Introduction                     Lab 1
            - OSI model, layering
            - TCP/IP protocol stack
            - service, interface
            - Internet

3           Chapter 2: Application Layer        
            - Application architecture
            - Web, HTTP

4           Chapter 2: Application Layer                Socket 
            - Email, SMTP                               programming
            - File transfer, FTP                        Assignment 1
            - Domain Name System

5           Chapter 2: Application Layer 
            - Domain Name System, DNS security
            - P2P
            - Socket programming-UDP python

6           Chapter 2: Application Layer 
            - Socket programming-TCP python
            - Socket programming-c
            - demos
            Chapter 3: Transport Layer
            - Transport-layer services
            - Multiplexing and demultiplexing
            - Connection-less transport: UDP

7           Chapter 3: Transport Layer                  Lab 2,
            - Principles of reliable data transfer      Socket
            -- stop and wait protocol versions          programming
            -- piplined protocol versions               Assignment 2

8           Chapter 3: Transport Layer                  Mid-term quiz
            - Connection-oriented transport: TCP
            -- segment structure

9           Chapter 3: Transport Layer                  Lab 3
            - Connection-oriented transport: TCP
            -- segment structure
            -- reliable data transfer
            -- flow control

10          Chapter 3: Transport Layer
            - Connection-oriented transport: TCP
            -- 3-way handshake
            - Congestion control
            -- TCP faireness
            Topic 4: Network Layer
            - Introduction
            - Virtual circuit and datagram network
            - What’s inside a router

11          Topic 4: Network Layer                      Socket
            - What’s inside a router                    programming
            - Internet protocol                         Assignment 3
            -- datagram format
            -- IPv4
            - demos

12          Topic 4: Network Layer
            - Internet protocol
            -- IPv6
            - Routing
            - Routing protocols

13          Topic 4: Network Layer
            - broadcast, multicast
            Topic 5: Link Layer
            - introduction
            - error detection, CRC
            - multiple access protocols

14          Topic 5: Link Layer
            - multiple access protocols
            - MAC address, ARP
            - Ethernet, switch, VLAN

15          Topic 5: Link Layer
            - link virtualization: MPLS
            - data center networking
            - a day in the life of a web request
</pre>
Security will be introduced when and where related to the covered topics.
