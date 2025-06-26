from pytube import YouTube

link=input("Enter the link of the video: ")
yt=YouTube(link)

download=yt.streams.get_highest_resolution()
print("Downloading...")

download.download(filename="video_Downloaded.mp4")
print("Download completed!")