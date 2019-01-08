
function showHisto(h)

x=[1:256];
%stem(x,h);
bar(x,h,0.1);
axis([1 255]);
colormap(gray(255));
colorbar ("SouthOutside", "xtick", []);

end;
