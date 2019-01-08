function h = histogram(image, canal)
h=zeros(1,256);
[filas, cols, canales]= size(image);

for i=1:filas
  for j=1:cols
    pixel = image(i,j,canal)+1;
    h(pixel) = h(pixel)+1;
  end
  
end

end

