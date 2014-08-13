# Hexlet Java Community Problem #1
## Дано
Имеется массив данных `int[] data` который структурирован следующим образом:
~~~~
   0                   1                   2                   3                   4
   0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7
  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
  |P|            Username         |            Password           |S|     Date      | Note        |
  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
  
  P - Priv
  01 - Operator
  02 - User
  03 - Administrator
  04 - Supervisor
  
  S - Status
  01 - OK
  02 - Block
  
  Date
  DDMMYYYY
  
  Note:
  Note Text
  ~~~~
  
## Задача
Задача прочитать данный массив и вывести его на экран в виде:
`      Hexlet Java Community Problems (HJCP)
       Problem: #1 (https://github.com/hjcp/hjcp1.git)
       Create by: <Author>
       URL: <URL Github>
       Version: X
 
 **********************************************************************************
 * Privilogy     * Username      * Password       * Status * Date       * Note    *
 **********************************************************************************
 * Supervisor    * supername     * superpass      * OK     * 2001/01/01 * NoteSup *
 * Administrator * adminname     * adminpass      * OK     * 2001/01/01 * NoteAdm *
 * User          * username      * userpass       * Block  * 2014/08/10 * NoteUsr *
 * Operator      * opername      * operpass       * OK     * 2014/08/10 * NoteOpr *
 **********************************************************************************`
 
