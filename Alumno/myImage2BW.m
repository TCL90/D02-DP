function bwImage = myImage2BW(imagen, threshold)
[rows cols] = size(imagen);
bwImage = zeros(rows, cols);

%[c] Recorrer la imagen pixel a pixel y si el valor es mayor al umbral se asigna el valor 255
%Las imágnes a crear tienen que tener valores enteros. No olviden poner el casting
for r=1:rows 
  for c=1:cols 
    if (imagen(r,c) > threshold) 
      bwImage(r,c) = 255; 
    end 
  end 
end 
end