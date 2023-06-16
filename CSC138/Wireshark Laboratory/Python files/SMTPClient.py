from socket import *
msg = "\r\n I love computer networks!"
endmsg = "\r\n.\r\n"

# Choose a mail server (e.g. Google mail server) and call it mailserver
mailserver = 'smtp.csus.edu'
mailport = 25

# Create socket called clientSocket and establish a TCP connection with mailserver
clientSocket = socket(AF_INET, SOCK_STREAM)
clientSocket.connect((mailserver,mailport))

recv = clientSocket.recv(1024).decode()
print(recv)
if recv[:3] != '220':
     print('220 reply not received from server.')

# Send HELO command and print server response.
heloCommand = 'HELO Alice\r\n'
clientSocket.send(heloCommand.encode())
recv1 = clientSocket.recv(1024).decode()
print(recv1)
if recv1[:3] != '250':
 print('250 reply not received from server.')
 
# Send MAIL FROM command and print server response.
MailFrom = 'MAIL FROM: <vktalgador@csus.edu>\r\n'
clientSocket.send(MailFrom.encode())
recv2 = clientSocket.recv(1024).decode()
print(recv2)

# Send RCPT TO command and print server response. 
RcpTo = 'RCPT TO: <vigomarkimalgador@csus.edu>\r\n'
clientSocket.send(RcpTo.encode())
recv3 = clientSocket.recv(1024).decode()
print(recv3)

# Send DATA command and print server response. 
data = 'DATA\r\n'
clientSocket.send(data.encode())
recv4 = clientSocket.recv(1024).decode()
print(recv4)

# Send message data.
clientSocket.send(msg.encode())

# Message ends with a single period.
clientSocket.send(endmsg.encode())
recv6 = clientSocket.recv(1024).decode()
print(recv6)

# Send QUIT command and get server response.
quit = "QUIT\r\n"
clientSocket.send(quit.encode())
recv7 = clientSocket.recv(1024).decode()
print(recv7)
clientSocket.close()
