function out = imRemap(image)

maxval = max(max(image));
minval = min(min(image));

minval
maxval

%[c] image debe ser igual al valor actual menos el valor minimo por 255, este valor debe dividirse entre la diferencia entre maxval y minval

[filas, cols] = size(image); 
for f=1:filas 
  for c=1:cols 
    image(f,c) = (image(f,c)-minval)*255/(maxval-minval); 
  end 
end 

out = uint8(image);
endfunction
